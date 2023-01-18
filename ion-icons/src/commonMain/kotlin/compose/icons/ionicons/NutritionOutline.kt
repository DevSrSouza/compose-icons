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

public val IonIcons.NutritionOutline: ImageVector
    get() {
        if (_nutritionOutline != null) {
            return _nutritionOutline!!
        }
        _nutritionOutline = Builder(name = "NutritionOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.0f, 128.0f)
                curveToRelative(-32.26f, -2.89f, -64.0f, 16.0f, -96.0f, 16.0f)
                reflectiveCurveToRelative(-63.75f, -19.0f, -96.0f, -16.0f)
                curveToRelative(-64.0f, 6.0f, -96.0f, 64.0f, -96.0f, 160.0f)
                curveToRelative(0.0f, 80.0f, 64.0f, 192.0f, 111.2f, 192.0f)
                reflectiveCurveToRelative(51.94f, -24.0f, 80.8f, -24.0f)
                reflectiveCurveToRelative(33.59f, 24.0f, 80.8f, 24.0f)
                reflectiveCurveTo(448.0f, 368.0f, 448.0f, 288.0f)
                curveTo(448.0f, 192.0f, 419.0f, 134.0f, 352.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(323.92f, 83.14f)
                curveToRelative(-21.0f, 21.0f, -45.66f, 27.0f, -58.82f, 28.79f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 103.2f)
                arcToRelative(97.6f, 97.6f, 0.0f, false, true, 28.61f, -59.33f)
                curveToRelative(22.0f, -22.0f, 46.0f, -26.9f, 58.72f, -27.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 352.0f, 24.94f)
                arcTo(98.0f, 98.0f, 0.0f, false, true, 323.92f, 83.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 304.0f)
                arcToRelative(24.0f, 48.0f, 0.0f, true, false, 48.0f, 0.0f)
                arcToRelative(24.0f, 48.0f, 0.0f, true, false, -48.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 304.0f)
                arcToRelative(24.0f, 48.0f, 0.0f, true, false, 48.0f, 0.0f)
                arcToRelative(24.0f, 48.0f, 0.0f, true, false, -48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _nutritionOutline!!
    }

private var _nutritionOutline: ImageVector? = null
