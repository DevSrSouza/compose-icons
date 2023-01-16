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

public val MaterialDesignIcons.BallotOutline: ImageVector
    get() {
        if (_ballotOutline != null) {
            return _ballotOutline!!
        }
        _ballotOutline = Builder(name = "BallotOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.5f)
                moveTo(13.0f, 14.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.5f)
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                moveTo(11.0f, 6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                moveTo(10.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                moveTo(11.0f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                moveTo(10.0f, 17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _ballotOutline!!
    }

private var _ballotOutline: ImageVector? = null
