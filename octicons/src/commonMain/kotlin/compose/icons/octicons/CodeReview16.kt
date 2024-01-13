package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.CodeReview16: ImageVector
    get() {
        if (_codeReview16 != null) {
            return _codeReview16!!
        }
        _codeReview16 = Builder(name = "CodeReview16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.75f, 1.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 13.0f)
                lineTo(8.061f, 13.0f)
                lineToRelative(-2.574f, 2.573f)
                arcTo(1.458f, 1.458f, 0.0f, false, true, 3.0f, 14.543f)
                lineTo(3.0f, 13.0f)
                lineTo(1.75f, 13.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 11.25f)
                verticalLineToRelative(-8.5f)
                curveTo(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f)
                close()
                moveTo(1.5f, 2.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.19f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(1.75f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(6.78f, 4.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineTo(5.31f, 7.0f)
                lineToRelative(1.47f, 1.47f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, 1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, 0.018f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
                moveTo(9.22f, 4.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, -0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, -1.042f)
                lineTo(10.69f, 7.0f)
                lineTo(9.22f, 5.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        .build()
        return _codeReview16!!
    }

private var _codeReview16: ImageVector? = null
