package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.DesktopDownload24: ImageVector
    get() {
        if (_desktopDownload24 != null) {
            return _desktopDownload24!!
        }
        _desktopDownload24 = Builder(name = "DesktopDownload24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 9.331f)
                verticalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(8.58f)
                lineToRelative(1.949f, -2.11f)
                arcTo(0.75f, 0.75f, 0.0f, true, true, 15.8f, 8.237f)
                lineToRelative(-3.25f, 3.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.102f, 0.0f)
                lineToRelative(-3.25f, -3.52f)
                arcTo(0.75f, 0.75f, 0.0f, true, true, 9.3f, 7.22f)
                lineToRelative(1.949f, 2.111f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineToRelative(-5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 1.0f, 3.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(6.204f)
                curveToRelative(-0.171f, 1.375f, -0.805f, 2.652f, -1.77f, 3.757f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 7.75f, 22.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.565f, -1.243f)
                curveToRelative(-0.964f, -1.105f, -1.598f, -2.382f, -1.769f, -3.757f)
                horizontalLineToRelative(6.204f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 23.0f, 15.25f)
                verticalLineTo(3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 21.25f, 2.0f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(11.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineTo(2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(10.463f, 17.0f)
                curveToRelative(-0.126f, 1.266f, -0.564f, 2.445f, -1.223f, 3.5f)
                horizontalLineToRelative(5.52f)
                curveToRelative(-0.66f, -1.055f, -1.098f, -2.234f, -1.223f, -3.5f)
                horizontalLineToRelative(-3.074f)
                close()
            }
        }
        .build()
        return _desktopDownload24!!
    }

private var _desktopDownload24: ImageVector? = null
