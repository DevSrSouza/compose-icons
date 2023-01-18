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

public val IonIcons.BicycleSharp: ImageVector
    get() {
        if (_bicycleSharp != null) {
            return _bicycleSharp!!
        }
        _bicycleSharp = Builder(name = "BicycleSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 192.0f)
                lineToRelative(-29.5f, -60.1f)
                curveTo(284.32f, 118.0f, 284.32f, 118.0f, 264.0f, 118.0f)
                curveToRelative(-13.26f, 0.0f, -14.76f, 0.0f, -23.0f, 7.3f)
                lineToRelative(-71.7f, 69.1f)
                curveTo(161.0f, 202.85f, 160.0f, 203.85f, 160.0f, 221.0f)
                curveToRelative(0.0f, 12.67f, 3.78f, 14.61f, 18.51f, 22.9f)
                lineTo(240.0f, 278.0f)
                verticalLineToRelative(90.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(254.0f)
                reflectiveCurveToRelative(-29.0f, -17.0f, -48.3f, -30.0f)
                lineToRelative(48.9f, -51.5f)
                curveToRelative(18.7f, 28.5f, 27.3f, 51.5f, 38.0f, 51.5f)
                horizontalLineTo(384.0f)
                verticalLineTo(192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(388.0f, 448.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 388.0f, 448.0f)
                close()
                moveTo(388.0f, 296.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 388.0f, 296.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 448.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 124.0f, 448.0f)
                close()
                moveTo(124.0f, 296.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 124.0f, 296.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 128.0f)
                arcToRelative(31.89f, 31.89f, 0.0f, false, false, 32.0f, -32.1f)
                arcTo(31.55f, 31.55f, 0.0f, false, false, 320.2f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -0.2f, 64.0f)
                close()
            }
        }
        .build()
        return _bicycleSharp!!
    }

private var _bicycleSharp: ImageVector? = null
