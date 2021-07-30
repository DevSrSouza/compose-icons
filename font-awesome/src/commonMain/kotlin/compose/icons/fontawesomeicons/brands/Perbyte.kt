package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Perbyte: ImageVector
    get() {
        if (_perbyte != null) {
            return _perbyte!!
        }
        _perbyte = Builder(name = "Perbyte", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(305.314f, 284.578f)
                lineTo(246.6f, 284.578f)
                lineTo(246.6f, 383.3f)
                horizontalLineToRelative(58.711f)
                quadToRelative(24.423f, 0.0f, 38.193f, -13.77f)
                reflectiveQuadToRelative(13.77f, -36.11f)
                quadToRelative(0.0f, -21.826f, -14.032f, -35.335f)
                reflectiveQuadTo(305.314f, 284.578f)
                close()
                moveTo(149.435f, 128.7f)
                lineTo(90.724f, 128.7f)
                verticalLineToRelative(98.723f)
                horizontalLineToRelative(58.711f)
                quadToRelative(24.42f, 0.0f, 38.19f, -13.773f)
                reflectiveQuadToRelative(13.77f, -36.107f)
                quadToRelative(0.0f, -21.826f, -14.029f, -35.338f)
                reflectiveQuadTo(149.435f, 128.7f)
                close()
                moveTo(366.647f, 32.0f)
                lineTo(81.353f, 32.0f)
                arcTo(81.445f, 81.445f, 0.0f, false, false, 0.0f, 113.352f)
                lineTo(0.0f, 398.647f)
                arcTo(81.445f, 81.445f, 0.0f, false, false, 81.353f, 480.0f)
                lineTo(366.647f, 480.0f)
                arcTo(81.445f, 81.445f, 0.0f, false, false, 448.0f, 398.647f)
                lineTo(448.0f, 113.352f)
                arcTo(81.445f, 81.445f, 0.0f, false, false, 366.647f, 32.0f)
                close()
                moveTo(430.282f, 398.647f)
                arcToRelative(63.706f, 63.706f, 0.0f, false, true, -63.635f, 63.635f)
                lineTo(81.353f, 462.282f)
                arcToRelative(63.706f, 63.706f, 0.0f, false, true, -63.635f, -63.635f)
                lineTo(17.718f, 113.352f)
                arcTo(63.706f, 63.706f, 0.0f, false, true, 81.353f, 49.718f)
                lineTo(366.647f, 49.718f)
                arcToRelative(63.706f, 63.706f, 0.0f, false, true, 63.635f, 63.634f)
                close()
                moveTo(305.314f, 128.7f)
                lineTo(246.6f, 128.7f)
                verticalLineToRelative(98.723f)
                horizontalLineToRelative(58.711f)
                quadToRelative(24.423f, 0.0f, 38.193f, -13.773f)
                reflectiveQuadToRelative(13.77f, -36.107f)
                quadToRelative(0.0f, -21.826f, -14.032f, -35.338f)
                reflectiveQuadTo(305.314f, 128.7f)
                close()
            }
        }
        .build()
        return _perbyte!!
    }

private var _perbyte: ImageVector? = null
