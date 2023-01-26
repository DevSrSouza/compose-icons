package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.LabelOff: ImageVector
    get() {
        if (_labelOff != null) {
            return _labelOff!!
        }
        _labelOff = Builder(name = "LabelOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.25f, 2.75f)
                lineToRelative(17.0f, 17.0f)
                lineTo(19.0f, 21.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, 0.23f, -1.05f, 0.59f, -1.41f)
                lineTo(2.0f, 4.0f)
                lineToRelative(1.25f, -1.25f)
                close()
                moveTo(22.0f, 12.0f)
                lineToRelative(-4.37f, -6.16f)
                curveTo(17.27f, 5.33f, 16.67f, 5.0f, 16.0f, 5.0f)
                horizontalLineTo(8.0f)
                lineToRelative(11.0f, 11.0f)
                lineToRelative(3.0f, -4.0f)
                close()
            }
        }
        .build()
        return _labelOff!!
    }

private var _labelOff: ImageVector? = null
