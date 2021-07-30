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
                moveTo(443.427f, 64.0f)
                horizontalLineTo(4.571f)
                curveToRelative(0.0f, 103.26f, 22.192f, 180.06f, 43.418f, 222.358f)
                curveTo(112.046f, 414.135f, 224.0f, 448.0f, 225.256f, 448.0f)
                arcToRelative(312.824f, 312.824f, 0.0f, false, false, 140.55f, -103.477f)
                curveToRelative(25.907f, -33.923f, 53.1f, -87.19f, 65.916f, -145.761f)
                horizontalLineTo(171.833f)
                curveToRelative(4.14f, 36.429f, 22.177f, 67.946f, 45.1f, 86.944f)
                horizontalLineToRelative(88.589f)
                curveToRelative(-17.012f, 28.213f, -48.186f, 54.4f, -80.456f, 69.482f)
                curveToRelative(-31.232f, -13.259f, -69.09f, -46.544f, -96.548f, -98.362f)
                curveToRelative(-26.726f, -53.833f, -27.092f, -105.883f, -27.092f, -105.883f)
                horizontalLineTo(437.573f)
                arcTo(625.91f, 625.91f, 0.0f, false, false, 443.427f, 64.0f)
                close()
            }
        }
        .build()
        return _guilded!!
    }

private var _guilded: ImageVector? = null
