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

public val SimpleIcons.Cplusplus: ImageVector
    get() {
        if (_cplusplus != null) {
            return _cplusplus!!
        }
        _cplusplus = Builder(name = "Cplusplus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.394f, 6.0f)
                curveToRelative(-0.167f, -0.29f, -0.398f, -0.543f, -0.652f, -0.69f)
                lineTo(12.926f, 0.22f)
                curveToRelative(-0.509f, -0.294f, -1.34f, -0.294f, -1.848f, 0.0f)
                lineTo(2.26f, 5.31f)
                curveToRelative(-0.508f, 0.293f, -0.923f, 1.013f, -0.923f, 1.6f)
                verticalLineToRelative(10.18f)
                curveToRelative(0.0f, 0.294f, 0.104f, 0.62f, 0.271f, 0.91f)
                curveToRelative(0.167f, 0.29f, 0.398f, 0.543f, 0.652f, 0.69f)
                lineToRelative(8.816f, 5.09f)
                curveToRelative(0.508f, 0.293f, 1.34f, 0.293f, 1.848f, 0.0f)
                lineToRelative(8.816f, -5.09f)
                curveToRelative(0.254f, -0.147f, 0.485f, -0.4f, 0.652f, -0.69f)
                curveToRelative(0.167f, -0.29f, 0.27f, -0.616f, 0.27f, -0.91f)
                lineTo(22.662f, 6.91f)
                curveToRelative(0.003f, -0.294f, -0.1f, -0.62f, -0.268f, -0.91f)
                close()
                moveTo(12.0f, 19.11f)
                curveToRelative(-3.92f, 0.0f, -7.109f, -3.19f, -7.109f, -7.11f)
                curveToRelative(0.0f, -3.92f, 3.19f, -7.11f, 7.11f, -7.11f)
                arcToRelative(7.133f, 7.133f, 0.0f, false, true, 6.156f, 3.553f)
                lineToRelative(-3.076f, 1.78f)
                arcToRelative(3.567f, 3.567f, 0.0f, false, false, -3.08f, -1.78f)
                arcTo(3.56f, 3.56f, 0.0f, false, false, 8.444f, 12.0f)
                arcTo(3.56f, 3.56f, 0.0f, false, false, 12.0f, 15.555f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 3.08f, -1.778f)
                lineToRelative(3.078f, 1.78f)
                arcTo(7.135f, 7.135f, 0.0f, false, true, 12.0f, 19.11f)
                close()
                moveTo(19.11f, 12.395f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(0.79f)
                close()
                moveTo(22.072f, 12.395f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(0.79f)
                close()
            }
        }
        .build()
        return _cplusplus!!
    }

private var _cplusplus: ImageVector? = null
