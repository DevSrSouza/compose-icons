package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoNpm: ImageVector
    get() {
        if (_logoNpm != null) {
            return _logoNpm!!
        }
        _logoNpm = Builder(name = "LogoNpm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.6f, 213.1f)
                horizontalLineToRelative(28.4f)
                verticalLineToRelative(57.1f)
                horizontalLineToRelative(-28.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 156.0f)
                lineTo(0.0f, 327.4f)
                lineTo(142.2f, 327.4f)
                lineTo(142.2f, 356.0f)
                lineTo(256.0f, 356.0f)
                lineTo(256.0f, 327.4f)
                lineTo(512.0f, 327.4f)
                lineTo(512.0f, 156.0f)
                close()
                moveTo(142.2f, 298.9f)
                lineTo(113.8f, 298.9f)
                lineTo(113.8f, 213.2f)
                lineTo(85.3f, 213.2f)
                verticalLineToRelative(85.7f)
                lineTo(28.4f, 298.9f)
                lineTo(28.4f, 184.6f)
                lineTo(142.2f, 184.6f)
                close()
                moveTo(284.4f, 298.9f)
                lineTo(227.5f, 298.9f)
                verticalLineToRelative(28.6f)
                lineTo(170.6f, 327.5f)
                lineTo(170.6f, 184.6f)
                lineTo(284.4f, 184.6f)
                close()
                moveTo(483.6f, 298.9f)
                lineTo(455.2f, 298.9f)
                lineTo(455.2f, 213.2f)
                lineTo(426.8f, 213.2f)
                verticalLineToRelative(85.7f)
                lineTo(398.4f, 298.9f)
                lineTo(398.4f, 213.2f)
                lineTo(370.0f, 213.2f)
                verticalLineToRelative(85.7f)
                lineTo(313.1f, 298.9f)
                lineTo(313.1f, 184.6f)
                lineTo(483.8f, 184.6f)
                lineTo(483.8f, 298.9f)
                close()
            }
        }
        .build()
        return _logoNpm!!
    }

private var _logoNpm: ImageVector? = null
