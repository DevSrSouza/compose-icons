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

public val TablerIcons.BrandVlc: ImageVector
    get() {
        if (_brandVlc != null) {
            return _brandVlc!!
        }
        _brandVlc = Builder(name = "BrandVlc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.79f, 4.337f)
                lineToRelative(3.101f, 9.305f)
                curveToRelative(0.33f, 0.985f, -0.113f, 2.07f, -1.02f, 2.499f)
                arcToRelative(9.148f, 9.148f, 0.0f, false, true, -7.742f, 0.0f)
                curveToRelative(-0.907f, -0.428f, -1.35f, -1.514f, -1.02f, -2.499f)
                lineToRelative(3.1f, -9.305f)
                curveToRelative(0.267f, -0.8f, 0.985f, -1.337f, 1.791f, -1.337f)
                curveToRelative(0.807f, 0.0f, 1.525f, 0.537f, 1.79f, 1.337f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(-1.429f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.923f, 1.45f)
                lineToRelative(-0.571f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.923f, 2.55f)
                horizontalLineToRelative(13.998f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.923f, -2.55f)
                lineToRelative(-0.572f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.923f, -1.45f)
                horizontalLineToRelative(-1.426f)
            }
        }
        .build()
        return _brandVlc!!
    }

private var _brandVlc: ImageVector? = null
