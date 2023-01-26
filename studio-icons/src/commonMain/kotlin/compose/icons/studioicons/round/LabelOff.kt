package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.LabelOff: ImageVector
    get() {
        if (_labelOff != null) {
            return _labelOff!!
        }
        _labelOff = Builder(name = "LabelOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.59f, 12.58f)
                curveToRelative(0.25f, -0.35f, 0.25f, -0.81f, 0.0f, -1.16f)
                lineToRelative(-3.96f, -5.58f)
                curveTo(17.27f, 5.33f, 16.67f, 5.0f, 16.0f, 5.0f)
                horizontalLineTo(8.66f)
                lineToRelative(10.7f, 10.73f)
                lineToRelative(2.23f, -3.15f)
                close()
                moveTo(2.72f, 4.72f)
                lineToRelative(0.87f, 0.87f)
                curveTo(3.23f, 5.95f, 3.0f, 6.45f, 3.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(4.14f, 3.31f)
                curveToRelative(-0.38f, -0.38f, -1.01f, -0.39f, -1.4f, -0.01f)
                curveToRelative(-0.41f, 0.38f, -0.41f, 1.03f, -0.02f, 1.42f)
                close()
            }
        }
        .build()
        return _labelOff!!
    }

private var _labelOff: ImageVector? = null
