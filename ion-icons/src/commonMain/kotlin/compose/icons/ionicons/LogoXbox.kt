package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoXbox: ImageVector
    get() {
        if (_logoXbox != null) {
            return _logoXbox!!
        }
        _logoXbox = Builder(name = "LogoXbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.8f, 248.3f)
                curveToRelative(39.7f, -58.6f, 77.9f, -92.8f, 77.9f, -92.8f)
                reflectiveCurveToRelative(-42.1f, -48.9f, -92.8f, -67.4f)
                lineToRelative(-3.3f, -0.8f)
                arcTo(224.13f, 224.13f, 0.0f, false, false, 77.2f, 391.0f)
                curveTo(77.2f, 386.6f, 77.8f, 320.7f, 126.8f, 248.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 256.0f)
                arcTo(223.71f, 223.71f, 0.0f, false, false, 403.4f, 87.3f)
                lineToRelative(-3.2f, 0.9f)
                curveToRelative(-50.7f, 18.5f, -92.9f, 67.4f, -92.9f, 67.4f)
                reflectiveCurveToRelative(38.2f, 34.2f, 77.9f, 92.8f)
                curveToRelative(49.0f, 72.4f, 49.6f, 138.3f, 49.5f, 142.7f)
                arcTo(222.8f, 222.8f, 0.0f, false, false, 480.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.2f, 80.9f)
                curveToRelative(29.3f, 13.1f, 54.6f, 34.6f, 54.6f, 34.6f)
                reflectiveCurveToRelative(25.5f, -21.4f, 54.8f, -34.6f)
                curveToRelative(36.8f, -16.5f, 64.9f, -11.3f, 72.3f, -9.5f)
                arcToRelative(224.06f, 224.06f, 0.0f, false, false, -253.8f, 0.0f)
                curveTo(136.3f, 69.6f, 164.3f, 64.3f, 201.2f, 80.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(358.7f, 292.9f)
                curveTo(312.4f, 236.0f, 255.8f, 199.0f, 255.8f, 199.0f)
                reflectiveCurveToRelative(-56.3f, 37.0f, -102.7f, 93.9f)
                curveToRelative(-39.8f, 48.9f, -54.6f, 84.8f, -62.6f, 107.8f)
                lineToRelative(-1.3f, 4.8f)
                arcToRelative(224.0f, 224.0f, 0.0f, false, false, 333.6f, 0.0f)
                lineToRelative(-1.4f, -4.8f)
                curveTo(413.4f, 377.7f, 398.5f, 341.8f, 358.7f, 292.9f)
                close()
            }
        }
        .build()
        return _logoXbox!!
    }

private var _logoXbox: ImageVector? = null
