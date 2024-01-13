package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandEnvato: ImageVector
    get() {
        if (_brandEnvato != null) {
            return _brandEnvato!!
        }
        _brandEnvato = Builder(name = "BrandEnvato", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.711f, 17.875f)
                curveToRelative(-0.534f, -1.339f, -1.35f, -4.178f, 0.129f, -6.47f)
                curveToRelative(1.415f, -2.193f, 3.769f, -3.608f, 5.099f, -4.278f)
                lineToRelative(-5.229f, 10.748f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.715f, 12.508f)
                curveToRelative(-0.54f, 3.409f, -2.094f, 6.156f, -4.155f, 7.348f)
                curveToRelative(-4.069f, 2.353f, -8.144f, 0.45f, -9.297f, -0.188f)
                curveToRelative(0.877f, -1.436f, 4.433f, -7.22f, 6.882f, -10.591f)
                curveToRelative(2.714f, -3.737f, 5.864f, -5.978f, 6.565f, -6.077f)
                curveToRelative(0.0f, 0.201f, 0.03f, 0.55f, 0.071f, 1.03f)
                curveToRelative(0.144f, 1.709f, 0.443f, 5.264f, -0.066f, 8.478f)
                close()
            }
        }
        .build()
        return _brandEnvato!!
    }

private var _brandEnvato: ImageVector? = null
