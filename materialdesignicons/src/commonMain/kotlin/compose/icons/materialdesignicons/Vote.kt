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

public val MaterialDesignIcons.Vote: ImageVector
    get() {
        if (_vote != null) {
            return _vote!!
        }
        _vote = Builder(name = "Vote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                horizontalLineTo(17.32f)
                lineTo(15.32f, 15.0f)
                horizontalLineTo(17.23f)
                lineTo(19.0f, 17.0f)
                horizontalLineTo(5.0f)
                lineTo(6.78f, 15.0f)
                horizontalLineTo(8.83f)
                lineTo(6.83f, 13.0f)
                horizontalLineTo(6.0f)
                lineTo(3.0f, 16.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(16.0f)
                lineTo(18.0f, 13.0f)
                moveTo(17.0f, 7.95f)
                lineTo(12.05f, 12.9f)
                lineTo(8.5f, 9.36f)
                lineTo(13.46f, 4.41f)
                lineTo(17.0f, 7.95f)
                moveTo(12.76f, 2.29f)
                lineTo(6.39f, 8.66f)
                curveTo(6.0f, 9.05f, 6.0f, 9.68f, 6.39f, 10.07f)
                lineTo(11.34f, 15.0f)
                curveTo(11.73f, 15.41f, 12.36f, 15.41f, 12.75f, 15.0f)
                lineTo(19.11f, 8.66f)
                curveTo(19.5f, 8.27f, 19.5f, 7.64f, 19.11f, 7.25f)
                lineTo(14.16f, 2.3f)
                curveTo(13.78f, 1.9f, 13.15f, 1.9f, 12.76f, 2.29f)
                close()
            }
        }
        .build()
        return _vote!!
    }

private var _vote: ImageVector? = null
