package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(4.69f, 427.31f)
                lineTo(104.0f, 328.0f)
                lineToRelative(-32.92f, -31.03f)
                curveTo(55.96f, 281.85f, 66.67f, 256.0f, 88.05f, 256.0f)
                horizontalLineToRelative(112.0f)
                curveTo(213.3f, 256.0f, 224.0f, 266.74f, 224.0f, 280.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 21.38f, -25.8f, 32.09f, -40.92f, 16.97f)
                lineTo(152.0f, 376.0f)
                lineToRelative(-99.31f, 99.31f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0.0f)
                lineTo(4.69f, 449.94f)
                curveToRelative(-6.25f, -6.25f, -6.25f, -16.38f, 0.0f, -22.63f)
                close()
                moveTo(443.31f, 84.69f)
                lineTo(344.0f, 184.0f)
                lineToRelative(32.92f, 31.03f)
                curveToRelative(15.12f, 15.12f, 4.41f, 40.97f, -16.97f, 40.97f)
                horizontalLineToRelative(-112.0f)
                curveTo(234.7f, 256.0f, 224.0f, 245.26f, 224.0f, 232.0f)
                verticalLineTo(120.0f)
                curveToRelative(0.0f, -21.38f, 25.8f, -32.09f, 40.92f, -16.97f)
                lineTo(296.0f, 136.0f)
                lineToRelative(99.31f, -99.31f)
                curveToRelative(6.25f, -6.25f, 16.38f, -6.25f, 22.63f, 0.0f)
                lineToRelative(25.37f, 25.37f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0.0f, 22.63f)
                close()
            }
        }
        .build()
        return _compressAlt!!
    }

private var _compressAlt: ImageVector? = null
