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

public val SimpleIcons.Visualstudiocode: ImageVector
    get() {
        if (_visualstudiocode != null) {
            return _visualstudiocode!!
        }
        _visualstudiocode = Builder(name = "Visualstudiocode", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.15f, 2.587f)
                lineTo(18.21f, 0.21f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, false, -1.705f, 0.29f)
                lineToRelative(-9.46f, 8.63f)
                lineToRelative(-4.12f, -3.128f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.276f, 0.057f)
                lineTo(0.327f, 7.261f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.326f, 8.74f)
                lineTo(3.899f, 12.0f)
                lineTo(0.326f, 15.26f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.001f, 1.479f)
                lineTo(1.65f, 17.94f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 1.276f, 0.057f)
                lineToRelative(4.12f, -3.128f)
                lineToRelative(9.46f, 8.63f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, false, 1.704f, 0.29f)
                lineToRelative(4.942f, -2.377f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 20.06f)
                lineTo(24.0f, 3.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.85f, -1.352f)
                close()
                moveTo(18.004f, 17.448f)
                lineTo(10.826f, 12.0f)
                lineToRelative(7.178f, -5.448f)
                verticalLineToRelative(10.896f)
                close()
            }
        }
        .build()
        return _visualstudiocode!!
    }

private var _visualstudiocode: ImageVector? = null
