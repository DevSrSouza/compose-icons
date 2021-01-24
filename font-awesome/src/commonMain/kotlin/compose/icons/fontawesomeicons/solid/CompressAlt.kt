package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CompressAlt: ImageVector
    get() {
        if (_compressAlt != null) {
            return _compressAlt!!
        }
        _compressAlt = Builder(name = "CompressAlt", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.686f, 427.314f)
                lineTo(104.0f, 328.0f)
                lineToRelative(-32.922f, -31.029f)
                curveTo(55.958f, 281.851f, 66.666f, 256.0f, 88.048f, 256.0f)
                horizontalLineToRelative(112.0f)
                curveTo(213.303f, 256.0f, 224.0f, 266.745f, 224.0f, 280.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 21.382f, -25.803f, 32.09f, -40.922f, 16.971f)
                lineTo(152.0f, 376.0f)
                lineToRelative(-99.314f, 99.314f)
                curveToRelative(-6.248f, 6.248f, -16.379f, 6.248f, -22.627f, 0.0f)
                lineTo(4.686f, 449.941f)
                curveToRelative(-6.248f, -6.248f, -6.248f, -16.379f, 0.0f, -22.627f)
                close()
                moveTo(443.314f, 84.686f)
                lineTo(344.0f, 184.0f)
                lineToRelative(32.922f, 31.029f)
                curveToRelative(15.12f, 15.12f, 4.412f, 40.971f, -16.97f, 40.971f)
                horizontalLineToRelative(-112.0f)
                curveTo(234.697f, 256.0f, 224.0f, 245.255f, 224.0f, 232.0f)
                verticalLineTo(120.0f)
                curveToRelative(0.0f, -21.382f, 25.803f, -32.09f, 40.922f, -16.971f)
                lineTo(296.0f, 136.0f)
                lineToRelative(99.314f, -99.314f)
                curveToRelative(6.248f, -6.248f, 16.379f, -6.248f, 22.627f, 0.0f)
                lineToRelative(25.373f, 25.373f)
                curveToRelative(6.248f, 6.248f, 6.248f, 16.379f, 0.0f, 22.627f)
                close()
            }
        }
        .build()
        return _compressAlt!!
    }

private var _compressAlt: ImageVector? = null
