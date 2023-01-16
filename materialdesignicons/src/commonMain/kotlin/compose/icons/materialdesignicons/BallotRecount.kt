package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.BallotRecount: ImageVector
    get() {
        if (_ballotRecount != null) {
            return _ballotRecount!!
        }
        _ballotRecount = Builder(name = "BallotRecount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                verticalLineTo(13.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 17.5f)
                curveTo(23.0f, 18.32f, 22.75f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 15.0f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19.0f, 12.0f)
                moveTo(19.0f, 23.0f)
                verticalLineTo(21.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 17.5f)
                curveTo(15.0f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 20.0f)
                verticalLineTo(18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19.0f, 23.0f)
                moveTo(10.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                moveTo(10.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                moveTo(5.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(11.17f)
                curveTo(20.5f, 11.06f, 20.0f, 11.0f, 19.5f, 11.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 13.0f, 17.5f)
                curveTo(13.0f, 18.79f, 13.38f, 20.0f, 14.0f, 21.0f)
                horizontalLineTo(5.0f)
                moveTo(13.0f, 9.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.5f)
                moveTo(11.0f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                moveTo(11.0f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _ballotRecount!!
    }

private var _ballotRecount: ImageVector? = null
