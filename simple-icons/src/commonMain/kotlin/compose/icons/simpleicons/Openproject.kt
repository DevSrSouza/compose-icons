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

public val SimpleIcons.Openproject: ImageVector
    get() {
        if (_openproject != null) {
            return _openproject!!
        }
        _openproject = Builder(name = "Openproject", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.35f, 0.37f)
                horizontalLineToRelative(-1.86f)
                arcToRelative(4.628f, 4.628f, 0.0f, false, false, -4.652f, 4.624f)
                verticalLineToRelative(5.609f)
                lineTo(4.652f, 10.603f)
                arcTo(4.628f, 4.628f, 0.0f, false, false, 0.0f, 15.23f)
                verticalLineToRelative(3.721f)
                curveToRelative(0.0f, 2.569f, 2.083f, 4.679f, 4.652f, 4.679f)
                horizontalLineToRelative(1.86f)
                curveToRelative(2.57f, 0.0f, 4.652f, -2.11f, 4.652f, -4.679f)
                verticalLineToRelative(-3.72f)
                curveToRelative(0.0f, -0.063f, 0.0f, -0.158f, -0.005f, -0.158f)
                lineTo(8.373f, 15.073f)
                verticalLineToRelative(3.88f)
                curveToRelative(0.0f, 1.026f, -0.835f, 1.886f, -1.861f, 1.886f)
                horizontalLineToRelative(-1.86f)
                curveToRelative(-1.027f, 0.0f, -1.861f, -0.864f, -1.861f, -1.886f)
                lineTo(2.791f, 15.23f)
                arcToRelative(1.839f, 1.839f, 0.0f, false, true, 1.86f, -1.833f)
                horizontalLineToRelative(14.697f)
                curveToRelative(2.57f, 0.0f, 4.652f, -2.11f, 4.652f, -4.679f)
                lineTo(24.0f, 4.997f)
                arcTo(4.628f, 4.628f, 0.0f, false, false, 19.35f, 0.37f)
                close()
                moveTo(21.211f, 8.715f)
                curveToRelative(0.0f, 1.026f, -0.835f, 1.886f, -1.861f, 1.886f)
                horizontalLineToRelative(-3.721f)
                lineTo(15.629f, 4.997f)
                arcToRelative(1.839f, 1.839f, 0.0f, false, true, 1.86f, -1.833f)
                horizontalLineToRelative(1.86f)
                arcToRelative(1.839f, 1.839f, 0.0f, false, true, 1.862f, 1.833f)
                close()
                moveTo(12.838f, 18.421f)
                arcToRelative(0.236f, 0.236f, 0.0f, false, false, 0.0f, 0.03f)
                curveToRelative(0.0f, 0.746f, 0.629f, 1.344f, 1.396f, 1.344f)
                curveToRelative(0.767f, 0.0f, 1.395f, -0.594f, 1.395f, -1.34f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, false, 0.0f, -0.034f)
                verticalLineToRelative(-3.35f)
                horizontalLineToRelative(-2.791f)
                close()
            }
        }
        .build()
        return _openproject!!
    }

private var _openproject: ImageVector? = null
