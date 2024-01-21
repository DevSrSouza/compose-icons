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

public val SimpleIcons.Semanticrelease: ImageVector
    get() {
        if (_semanticrelease != null) {
            return _semanticrelease!!
        }
        _semanticrelease = Builder(name = "Semanticrelease", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.952f, 14.4f)
                arcToRelative(2.4f, 2.4f, 0.0f, true, true, 0.0f, -4.8f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 0.0f, 4.8f)
                close()
                moveTo(11.952f, 13.68f)
                arcToRelative(1.68f, 1.68f, 0.0f, true, false, 0.0f, -3.36f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, 0.0f, 3.36f)
                close()
                moveTo(8.304f, 3.12f)
                verticalLineToRelative(1.728f)
                curveToRelative(0.096f, 0.528f, 1.008f, 2.64f, 1.68f, 3.888f)
                curveTo(9.12f, 8.112f, 7.2f, 6.672f, 6.672f, 5.952f)
                arcToRelative(4.416f, 4.416f, 0.0f, false, true, -0.816f, -1.392f)
                lineTo(2.448f, 6.48f)
                verticalLineToRelative(4.128f)
                curveToRelative(0.432f, 0.24f, 1.104f, 0.72f, 1.488f, 0.864f)
                curveToRelative(0.528f, 0.192f, 2.832f, 0.432f, 4.224f, 0.48f)
                curveToRelative(-1.008f, 0.432f, -3.168f, 1.392f, -4.08f, 1.488f)
                curveToRelative(-0.768f, 0.144f, -1.296f, 0.048f, -1.632f, 0.0f)
                verticalLineToRelative(4.08f)
                lineToRelative(3.312f, 1.872f)
                curveToRelative(0.432f, -0.192f, 1.152f, -0.576f, 1.488f, -0.816f)
                curveToRelative(0.432f, -0.336f, 1.776f, -2.208f, 2.496f, -3.408f)
                curveToRelative(-0.096f, 1.056f, -0.384f, 3.408f, -0.72f, 4.272f)
                curveToRelative(-0.288f, 0.72f, -0.624f, 1.104f, -0.816f, 1.392f)
                lineTo(12.0f, 22.992f)
                lineToRelative(3.504f, -2.016f)
                curveToRelative(0.048f, -0.432f, 0.096f, -1.344f, 0.0f, -1.824f)
                curveToRelative(-0.048f, -0.528f, -1.008f, -2.64f, -1.632f, -3.888f)
                curveToRelative(0.864f, 0.672f, 2.736f, 2.112f, 3.312f, 2.832f)
                curveToRelative(0.528f, 0.624f, 0.72f, 1.152f, 0.816f, 1.44f)
                lineToRelative(3.552f, -2.016f)
                verticalLineToRelative(-4.032f)
                curveToRelative(-0.384f, -0.24f, -1.152f, -0.72f, -1.632f, -0.912f)
                curveToRelative(-0.48f, -0.192f, -2.784f, -0.432f, -4.176f, -0.48f)
                curveToRelative(1.008f, -0.48f, 3.168f, -1.392f, 4.08f, -1.488f)
                curveToRelative(0.864f, -0.144f, 1.392f, -0.048f, 1.728f, 0.048f)
                lineTo(21.552f, 6.48f)
                lineToRelative(-3.36f, -1.92f)
                lineToRelative(-1.488f, 0.912f)
                curveToRelative(-0.432f, 0.336f, -1.776f, 2.208f, -2.544f, 3.36f)
                curveToRelative(0.144f, -1.056f, 0.432f, -3.408f, 0.768f, -4.272f)
                curveToRelative(0.288f, -0.72f, 0.624f, -1.152f, 0.864f, -1.392f)
                lineTo(12.0f, 1.008f)
                close()
                moveTo(12.0f, 0.0f)
                lineToRelative(10.416f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineTo(1.584f, 18.0f)
                lineTo(1.584f, 6.0f)
                close()
            }
        }
        .build()
        return _semanticrelease!!
    }

private var _semanticrelease: ImageVector? = null
