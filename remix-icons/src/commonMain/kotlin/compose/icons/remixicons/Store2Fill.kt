package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Store2Fill: ImageVector
    get() {
        if (_store2Fill != null) {
            return _store2Fill!!
        }
        _store2Fill = Builder(name = "Store2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.758f)
                arcTo(4.496f, 4.496f, 0.0f, false, true, 1.0f, 9.5f)
                curveToRelative(0.0f, -0.827f, 0.224f, -1.624f, 0.633f, -2.303f)
                lineTo(4.345f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.866f, -0.5f)
                horizontalLineTo(18.79f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.866f, 0.5f)
                lineToRelative(2.702f, 4.682f)
                arcTo(4.496f, 4.496f, 0.0f, false, true, 21.0f, 13.242f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(5.789f, 4.0f)
                lineTo(3.356f, 8.213f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.466f, 2.216f)
                curveToRelative(0.335f, -0.837f, 1.52f, -0.837f, 1.856f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.644f, 0.0f)
                curveToRelative(0.335f, -0.837f, 1.52f, -0.837f, 1.856f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.457f, -2.232f)
                lineTo(18.21f, 4.0f)
                horizontalLineTo(5.79f)
                close()
            }
        }
        .build()
        return _store2Fill!!
    }

private var _store2Fill: ImageVector? = null
