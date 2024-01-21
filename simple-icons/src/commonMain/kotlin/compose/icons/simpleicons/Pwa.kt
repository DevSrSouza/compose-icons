package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Pwa: ImageVector
    get() {
        if (_pwa != null) {
            return _pwa!!
        }
        _pwa = Builder(name = "Pwa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5967f, 7.482f)
                lineTo(24.0f, 16.518f)
                horizontalLineToRelative(-2.5098f)
                lineToRelative(-0.5816f, -1.6184f)
                horizontalLineToRelative(-3.2452f)
                lineToRelative(0.6933f, -1.7532f)
                horizontalLineToRelative(2.0019f)
                lineToRelative(-0.95f, -2.6597f)
                lineToRelative(1.1881f, -3.0047f)
                close()
                moveTo(12.4857f, 7.482f)
                lineToRelative(1.7722f, 5.8393f)
                lineTo(16.75f, 7.482f)
                horizontalLineToRelative(2.4154f)
                lineToRelative(-3.6433f, 9.036f)
                horizontalLineToRelative(-2.3833f)
                lineToRelative(-1.6395f, -5.2366f)
                lineToRelative(-1.7196f, 5.2366f)
                horizontalLineToRelative(-2.377f)
                lineToRelative(-1.233f, -2.1161f)
                lineToRelative(1.2144f, -3.7415f)
                lineToRelative(1.342f, 2.6609f)
                lineToRelative(1.9029f, -5.8393f)
                horizontalLineToRelative(1.8566f)
                close()
                moveTo(3.7404f, 7.482f)
                curveToRelative(1.0635f, 0.0f, 1.8713f, 0.3055f, 2.4234f, 0.9166f)
                arcToRelative(2.647f, 2.647f, 0.0f, false, true, 0.2806f, 0.3684f)
                lineToRelative(-1.0753f, 3.3128f)
                lineToRelative(-0.3847f, 1.1854f)
                curveToRelative(-0.352f, 0.1006f, -0.7533f, 0.1509f, -1.204f, 0.1509f)
                lineTo(2.2928f, 13.4161f)
                verticalLineToRelative(3.102f)
                lineTo(0.0f, 16.5181f)
                lineTo(0.0f, 7.482f)
                close()
                moveTo(3.1588f, 9.2352f)
                horizontalLineToRelative(-0.866f)
                verticalLineToRelative(2.4276f)
                horizontalLineToRelative(0.8597f)
                curveToRelative(0.5577f, 0.0f, 0.9406f, -0.1194f, 1.1485f, -0.3582f)
                curveToRelative(0.1896f, -0.215f, 0.2845f, -0.5058f, 0.2845f, -0.8724f)
                curveToRelative(0.0f, -0.364f, -0.1079f, -0.6544f, -0.3235f, -0.8714f)
                curveToRelative(-0.2157f, -0.217f, -0.5834f, -0.3256f, -1.1032f, -0.3256f)
                close()
            }
        }
        .build()
        return _pwa!!
    }

private var _pwa: ImageVector? = null
