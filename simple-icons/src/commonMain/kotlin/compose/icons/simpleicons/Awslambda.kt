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

public val SimpleIcons.Awslambda: ImageVector
    get() {
        if (_awslambda != null) {
            return _awslambda!!
        }
        _awslambda = Builder(name = "Awslambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9855f, 0.0f)
                curveToRelative(-0.2941f, 0.0031f, -0.5335f, 0.2466f, -0.534f, 0.5482f)
                lineTo(4.446f, 5.456f)
                curveToRelative(0.0f, 0.1451f, 0.06f, 0.2835f, 0.159f, 0.3891f)
                arcToRelative(0.5322f, 0.5322f, 0.0f, false, false, 0.3806f, 0.1562f)
                horizontalLineToRelative(3.4282f)
                lineToRelative(8.197f, 17.6805f)
                arcToRelative(0.5365f, 0.5365f, 0.0f, false, false, 0.4885f, 0.3181f)
                horizontalLineToRelative(5.811f)
                curveToRelative(0.2969f, 0.0f, 0.5426f, -0.2448f, 0.5426f, -0.5482f)
                lineTo(23.4529f, 18.544f)
                curveToRelative(0.0f, -0.3035f, -0.2392f, -0.5482f, -0.5425f, -0.5482f)
                horizontalLineToRelative(-2.0138f)
                lineTo(12.7394f, 0.3153f)
                curveTo(12.647f, 0.124f, 12.4564f, 0.0f, 12.2452f, 0.0f)
                horizontalLineToRelative(-7.254f)
                close()
                moveTo(5.5252f, 1.0907f)
                horizontalLineToRelative(6.3678f)
                lineToRelative(8.16f, 17.6804f)
                arcToRelative(0.5365f, 0.5365f, 0.0f, false, false, 0.4885f, 0.3181f)
                horizontalLineToRelative(1.8178f)
                verticalLineToRelative(3.8173f)
                lineTo(17.437f, 22.9065f)
                lineTo(9.2402f, 5.226f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, false, -0.4885f, -0.318f)
                lineTo(5.5223f, 4.908f)
                close()
                moveTo(7.5389f, 9.3273f)
                curveToRelative(-0.2098f, 0.0011f, -0.3937f, 0.1193f, -0.4857f, 0.3096f)
                lineTo(0.6002f, 23.2133f)
                arcToRelative(0.5506f, 0.5506f, 0.0f, false, false, 0.0313f, 0.5282f)
                arcToRelative(0.5334f, 0.5334f, 0.0f, false, false, 0.4544f, 0.25f)
                horizontalLineToRelative(6.169f)
                arcToRelative(0.5468f, 0.5468f, 0.0f, false, false, 0.497f, -0.3096f)
                lineToRelative(3.38f, -7.166f)
                arcToRelative(0.5405f, 0.5405f, 0.0f, false, false, -0.0029f, -0.4686f)
                lineTo(8.036f, 9.637f)
                arcToRelative(0.5468f, 0.5468f, 0.0f, false, false, -0.4942f, -0.3096f)
                close()
                moveTo(7.5446f, 11.1309f)
                lineTo(10.0326f, 16.2831f)
                lineTo(6.9112f, 22.9037f)
                lineTo(1.9465f, 22.9037f)
                close()
            }
        }
        .build()
        return _awslambda!!
    }

private var _awslambda: ImageVector? = null
