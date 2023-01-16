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

public val MaterialDesignIcons.VoteOutline: ImageVector
    get() {
        if (_voteOutline != null) {
            return _voteOutline!!
        }
        _voteOutline = Builder(name = "VoteOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                lineTo(21.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 21.11f, 20.1f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 22.0f, 3.0f, 21.1f, 3.0f, 20.0f)
                verticalLineTo(16.0f)
                lineTo(6.0f, 13.0f)
                horizontalLineTo(6.83f)
                lineTo(8.83f, 15.0f)
                horizontalLineTo(6.78f)
                lineTo(5.0f, 17.0f)
                horizontalLineTo(19.0f)
                lineTo(17.23f, 15.0f)
                horizontalLineTo(15.32f)
                lineTo(17.32f, 13.0f)
                horizontalLineTo(18.0f)
                moveTo(19.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                moveTo(11.34f, 15.0f)
                lineTo(6.39f, 10.07f)
                curveTo(6.0f, 9.68f, 6.0f, 9.05f, 6.39f, 8.66f)
                lineTo(12.76f, 2.29f)
                curveTo(13.15f, 1.9f, 13.78f, 1.9f, 14.16f, 2.3f)
                lineTo(19.11f, 7.25f)
                curveTo(19.5f, 7.64f, 19.5f, 8.27f, 19.11f, 8.66f)
                lineTo(12.75f, 15.0f)
                curveTo(12.36f, 15.41f, 11.73f, 15.41f, 11.34f, 15.0f)
                moveTo(13.46f, 4.41f)
                lineTo(8.5f, 9.36f)
                lineTo(12.05f, 12.9f)
                lineTo(17.0f, 7.95f)
                lineTo(13.46f, 4.41f)
                close()
            }
        }
        .build()
        return _voteOutline!!
    }

private var _voteOutline: ImageVector? = null
