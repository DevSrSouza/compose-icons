package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.CodeReview24: ImageVector
    get() {
        if (_codeReview24 != null) {
            return _codeReview24!!
        }
        _codeReview24 = Builder(name = "CodeReview24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3f, 6.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.04f, 1.06f)
                lineToRelative(-2.908f, 2.7f)
                lineToRelative(2.908f, 2.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.02f, 1.1f)
                lineToRelative(-3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.1f)
                lineToRelative(3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.04f)
                close()
                moveTo(13.74f, 7.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.02f, -1.1f)
                lineToRelative(3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.1f)
                lineToRelative(-3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.02f, -1.1f)
                lineToRelative(2.908f, -2.7f)
                lineToRelative(-2.908f, -2.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 4.25f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(17.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(12.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                horizontalLineToRelative(-9.69f)
                lineToRelative(-3.573f, 3.573f)
                arcTo(1.458f, 1.458f, 0.0f, false, true, 5.0f, 21.043f)
                verticalLineTo(18.5f)
                horizontalLineTo(3.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, -1.75f)
                close()
                moveTo(3.25f, 4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.19f)
                lineToRelative(3.72f, -3.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineTo(4.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _codeReview24!!
    }

private var _codeReview24: ImageVector? = null
