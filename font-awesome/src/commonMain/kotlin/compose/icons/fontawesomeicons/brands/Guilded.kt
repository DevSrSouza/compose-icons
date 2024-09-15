package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Guilded: ImageVector
    get() {
        if (_guilded != null) {
            return _guilded!!
        }
        _guilded = Builder(name = "Guilded", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(443.43f, 64.0f)
                horizontalLineTo(4.57f)
                curveToRelative(0.0f, 103.26f, 22.19f, 180.06f, 43.42f, 222.36f)
                curveTo(112.05f, 414.14f, 224.0f, 448.0f, 225.26f, 448.0f)
                arcToRelative(312.82f, 312.82f, 0.0f, false, false, 140.55f, -103.48f)
                curveToRelative(25.91f, -33.92f, 53.1f, -87.19f, 65.92f, -145.76f)
                horizontalLineTo(171.83f)
                curveToRelative(4.14f, 36.43f, 22.18f, 67.95f, 45.1f, 86.94f)
                horizontalLineToRelative(88.59f)
                curveToRelative(-17.01f, 28.21f, -48.19f, 54.4f, -80.46f, 69.48f)
                curveToRelative(-31.23f, -13.26f, -69.09f, -46.54f, -96.55f, -98.36f)
                curveToRelative(-26.73f, -53.83f, -27.09f, -105.88f, -27.09f, -105.88f)
                horizontalLineTo(437.57f)
                arcTo(625.91f, 625.91f, 0.0f, false, false, 443.43f, 64.0f)
                close()
            }
        }
        .build()
        return _guilded!!
    }

private var _guilded: ImageVector? = null
