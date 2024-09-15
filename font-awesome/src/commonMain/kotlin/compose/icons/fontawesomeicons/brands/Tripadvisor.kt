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

public val BrandsGroup.Tripadvisor: ImageVector
    get() {
        if (_tripadvisor != null) {
            return _tripadvisor!!
        }
        _tripadvisor = Builder(name = "Tripadvisor", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.91f, 178.82f)
                lineTo(576.0f, 127.58f)
                lineTo(471.66f, 127.58f)
                arcToRelative(326.11f, 326.11f, 0.0f, false, false, -367.0f, 0.0f)
                lineTo(0.0f, 127.58f)
                lineToRelative(47.09f, 51.24f)
                arcTo(143.91f, 143.91f, 0.0f, false, false, 241.86f, 390.73f)
                lineTo(288.0f, 440.93f)
                lineToRelative(46.11f, -50.17f)
                arcTo(143.94f, 143.94f, 0.0f, false, false, 575.88f, 285.18f)
                horizontalLineToRelative(-0.03f)
                arcTo(143.56f, 143.56f, 0.0f, false, false, 528.91f, 178.82f)
                close()
                moveTo(144.06f, 382.57f)
                arcToRelative(97.39f, 97.39f, 0.0f, true, true, 97.39f, -97.39f)
                arcTo(97.39f, 97.39f, 0.0f, false, true, 144.06f, 382.57f)
                close()
                moveTo(288.0f, 282.37f)
                curveToRelative(0.0f, -64.09f, -46.62f, -119.08f, -108.09f, -142.59f)
                arcToRelative(281.0f, 281.0f, 0.0f, false, true, 216.17f, 0.0f)
                curveTo(334.61f, 163.3f, 288.0f, 218.29f, 288.0f, 282.37f)
                close()
                moveTo(431.88f, 382.57f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(97.4f, 97.4f, 0.0f, true, true, 0.01f, 0.0f)
                close()
                moveTo(144.06f, 234.12f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(51.06f, 51.06f, 0.0f, true, false, 51.06f, 51.06f)
                verticalLineToRelative(-0.11f)
                arcTo(51.0f, 51.0f, 0.0f, false, false, 144.06f, 234.12f)
                close()
                moveTo(431.88f, 234.12f)
                arcToRelative(51.06f, 51.06f, 0.0f, true, false, 51.06f, 51.06f)
                arcTo(51.06f, 51.06f, 0.0f, false, false, 431.88f, 234.12f)
                close()
            }
        }
        .build()
        return _tripadvisor!!
    }

private var _tripadvisor: ImageVector? = null
