package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SortAlphaUp: ImageVector
    get() {
        if (_sortAlphaUp != null) {
            return _sortAlphaUp!!
        }
        _sortAlphaUp = Builder(name = "SortAlphaUp", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 160.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(128.0f, 160.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(14.21f, 0.0f, 21.38f, -17.24f, 11.31f, -27.31f)
                lineToRelative(-80.0f, -96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineToRelative(-80.0f, 96.0f)
                curveTo(-5.35f, 142.74f, 1.78f, 160.0f, 16.0f, 160.0f)
                close()
                moveTo(416.0f, 288.0f)
                lineTo(288.0f, 288.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(56.0f)
                lineToRelative(-61.26f, 70.45f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 272.0f, 446.37f)
                lineTo(272.0f, 464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-56.0f)
                lineToRelative(61.26f, -70.45f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 432.0f, 321.63f)
                lineTo(432.0f, 304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(447.06f, 202.62f)
                lineToRelative(-59.27f, -160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 372.72f, 32.0f)
                horizontalLineToRelative(-41.44f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.07f, 10.62f)
                lineToRelative(-59.27f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 272.0f, 224.0f)
                horizontalLineToRelative(24.83f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.23f, -11.08f)
                lineToRelative(4.42f, -12.92f)
                horizontalLineToRelative(71.0f)
                lineToRelative(4.41f, 12.92f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 407.16f, 224.0f)
                lineTo(432.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.06f, -21.38f)
                close()
                moveTo(335.61f, 144.0f)
                lineTo(352.0f, 96.0f)
                lineToRelative(16.39f, 48.0f)
                close()
            }
        }
        .build()
        return _sortAlphaUp!!
    }

private var _sortAlphaUp: ImageVector? = null
