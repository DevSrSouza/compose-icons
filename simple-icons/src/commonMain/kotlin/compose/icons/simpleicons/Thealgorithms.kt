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

public val SimpleIcons.Thealgorithms: ImageVector
    get() {
        if (_thealgorithms != null) {
            return _thealgorithms!!
        }
        _thealgorithms = Builder(name = "Thealgorithms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.226f, 19.857f)
                lineTo(1.353f, 19.857f)
                lineToRelative(1.79f, -4.225f)
                horizontalLineToRelative(4.812f)
                lineTo(13.308f, 3.21f)
                lineTo(7.564f, 3.21f)
                lineToRelative(-4.226f, 9.82f)
                horizontalLineToRelative(2.587f)
                curveToRelative(0.18f, 0.3f, 0.511f, 0.51f, 0.887f, 0.51f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 1.038f, -1.037f)
                curveToRelative(0.0f, -0.572f, -0.467f, -1.023f, -1.038f, -1.023f)
                curveToRelative(-0.421f, 0.0f, -0.767f, 0.24f, -0.932f, 0.602f)
                lineTo(4.647f, 12.082f)
                lineToRelative(3.503f, -7.94f)
                horizontalLineToRelative(3.76f)
                lineTo(7.383f, 14.684f)
                lineToRelative(-4.766f, 0.03f)
                lineTo(0.0f, 20.79f)
                horizontalLineToRelative(8.842f)
                lineTo(10.0f, 18.263f)
                horizontalLineToRelative(3.835f)
                lineToRelative(1.278f, 2.526f)
                lineTo(24.0f, 20.789f)
                lineTo(15.985f, 3.211f)
                close()
                moveTo(10.496f, 17.271f)
                lineTo(11.88f, 14.248f)
                lineTo(13.383f, 17.271f)
                close()
                moveTo(15.714f, 19.962f)
                lineTo(14.842f, 18.203f)
                horizontalLineToRelative(2.737f)
                curveToRelative(0.18f, 0.33f, 0.526f, 0.556f, 0.917f, 0.556f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 1.038f, -1.037f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, -1.038f, -1.038f)
                curveToRelative(-0.42f, 0.0f, -0.782f, 0.256f, -0.947f, 0.617f)
                lineTo(14.42f, 17.301f)
                lineToRelative(-2.09f, -4.06f)
                lineToRelative(1.534f, -3.369f)
                lineToRelative(1.729f, 3.519f)
                horizontalLineToRelative(0.812f)
                curveToRelative(0.165f, 0.346f, 0.526f, 0.601f, 0.932f, 0.601f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 1.038f, -1.037f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, -1.038f, -1.038f)
                curveToRelative(-0.436f, 0.0f, -0.812f, 0.271f, -0.962f, 0.662f)
                horizontalLineToRelative(-0.3f)
                lineToRelative(-1.79f, -3.64f)
                lineToRelative(1.699f, -3.728f)
                lineToRelative(6.677f, 14.751f)
                close()
            }
        }
        .build()
        return _thealgorithms!!
    }

private var _thealgorithms: ImageVector? = null
