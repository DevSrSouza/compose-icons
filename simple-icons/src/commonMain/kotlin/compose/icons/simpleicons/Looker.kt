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

public val SimpleIcons.Looker: ImageVector
    get() {
        if (_looker != null) {
            return _looker!!
        }
        _looker = Builder(name = "Looker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9475f, 0.0f)
                curveToRelative(-1.1598f, 0.0021f, -2.0982f, 0.944f, -2.096f, 2.1038f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 0.356f, 1.166f)
                lineToRelative(0.895f, -0.8959f)
                arcToRelative(0.884f, 0.884f, 0.0f, true, true, 0.565f, 0.564f)
                lineToRelative(-0.895f, 0.895f)
                curveToRelative(0.9593f, 0.6478f, 2.2621f, 0.3953f, 2.91f, -0.564f)
                curveToRelative(0.6478f, -0.9593f, 0.3953f, -2.262f, -0.564f, -2.91f)
                arcTo(2.096f, 2.096f, 0.0f, false, false, 11.9475f, 0.0f)
                close()
                moveTo(11.1125f, 6.1128f)
                arcToRelative(3.2629f, 3.2629f, 0.0f, false, false, -0.653f, -1.965f)
                lineToRelative(-1.164f, 1.162f)
                arcToRelative(1.667f, 1.667f, 0.0f, false, true, -0.318f, 2.012f)
                lineToRelative(0.632f, 1.5449f)
                arcToRelative(3.2819f, 3.2819f, 0.0f, false, false, 1.503f, -2.754f)
                close()
                moveTo(7.8626f, 7.7788f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.9217f, 9.0E-4f, -1.6697f, -0.7455f, -1.6707f, -1.6673f)
                curveToRelative(-0.001f, -0.9217f, 0.7454f, -1.6697f, 1.6672f, -1.6707f)
                arcToRelative(1.669f, 1.669f, 0.0f, false, true, 0.9195f, 0.275f)
                lineToRelative(1.152f, -1.152f)
                curveToRelative(-1.4069f, -1.141f, -3.4724f, -0.9257f, -4.6135f, 0.4811f)
                reflectiveCurveToRelative(-0.9257f, 3.4723f, 0.481f, 4.6135f)
                arcToRelative(3.2799f, 3.2799f, 0.0f, false, false, 2.7275f, 0.6652f)
                lineToRelative(-0.633f, -1.5439f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(11.9905f, 9.1147f)
                curveToRelative(-0.728f, 0.0f, -1.452f, 0.106f, -2.15f, 0.315f)
                lineToRelative(0.922f, 2.2519f)
                curveToRelative(2.6872f, -0.6819f, 5.4184f, 0.9438f, 6.1002f, 3.631f)
                curveToRelative(0.6818f, 2.6873f, -0.9439f, 5.4184f, -3.6311f, 6.1002f)
                reflectiveCurveToRelative(-5.4184f, -0.9439f, -6.1002f, -3.631f)
                curveToRelative(-0.5682f, -2.2394f, 0.4655f, -4.5774f, 2.5041f, -5.6643f)
                lineToRelative(-0.91f, -2.2449f)
                curveToRelative(-3.6908f, 1.808f, -5.2173f, 6.2657f, -3.4093f, 9.9567f)
                lineToRelative(5.0E-4f, 0.001f)
                curveToRelative(1.808f, 3.6909f, 6.2657f, 5.2173f, 9.9567f, 3.4093f)
                lineToRelative(0.001f, -5.0E-4f)
                curveToRelative(3.6913f, -1.8071f, 5.2187f, -6.2645f, 3.4116f, -9.9558f)
                arcToRelative(7.4417f, 7.4417f, 0.0f, false, false, -6.6865f, -4.1696f)
                horizontalLineToRelative(-0.008f)
                lineToRelative(-0.001f, 0.001f)
                close()
            }
        }
        .build()
        return _looker!!
    }

private var _looker: ImageVector? = null
