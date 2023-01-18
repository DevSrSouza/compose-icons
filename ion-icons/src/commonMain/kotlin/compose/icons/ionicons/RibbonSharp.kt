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

public val IonIcons.RibbonSharp: ImageVector
    get() {
        if (_ribbonSharp != null) {
            return _ribbonSharp!!
        }
        _ribbonSharp = Builder(name = "RibbonSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 336.0f)
                curveToRelative(-5.22f, 0.0f, -10.4f, -0.24f, -15.51f, -0.69f)
                arcTo(176.12f, 176.12f, 0.0f, false, true, 109.2f, 256.94f)
                lineTo(20.0f, 416.0f)
                horizontalLineTo(135.0f)
                lineToRelative(58.0f, 96.0f)
                lineToRelative(82.53f, -177.09f)
                arcTo(177.53f, 177.53f, 0.0f, false, true, 256.0f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.0f, 256.74f)
                arcToRelative(176.9f, 176.9f, 0.0f, false, true, -88.18f, 69.14f)
                lineTo(273.7f, 415.5f)
                lineTo(319.0f, 512.0f)
                lineToRelative(58.0f, -96.0f)
                horizontalLineTo(492.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.02f, 160.0f)
                moveToRelative(-48.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 16.0f)
                curveToRelative(-79.4f, 0.0f, -144.0f, 64.6f, -144.0f, 144.0f)
                reflectiveCurveToRelative(64.6f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.6f, 144.0f, -144.0f)
                reflectiveCurveTo(335.4f, 16.0f, 256.0f, 16.0f)
                close()
                moveTo(256.0f, 240.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, -80.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 256.0f, 240.0f)
                close()
            }
        }
        .build()
        return _ribbonSharp!!
    }

private var _ribbonSharp: ImageVector? = null
