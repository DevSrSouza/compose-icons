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

public val RemixIcons.PrinterCloudLine: ImageVector
    get() {
        if (_printerCloudLine != null) {
            return _printerCloudLine!!
        }
        _printerCloudLine = Builder(name = "PrinterCloudLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineToRelative(0.001f, 5.346f)
                arcToRelative(5.516f, 5.516f, 0.0f, false, false, -2.0f, -1.745f)
                lineTo(20.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.207f)
                lineToRelative(-0.071f, 0.283f)
                lineToRelative(-0.03f, 0.02f)
                arcTo(4.763f, 4.763f, 0.0f, false, false, 10.567f, 17.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.06f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, false, 0.817f, 2.0f)
                lineTo(7.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(17.5f, 13.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                lineToRelative(-0.001f, 0.103f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.581f, 5.392f)
                lineTo(20.25f, 22.0f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-0.168f, -0.005f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.579f, -5.392f)
                lineTo(14.0f, 16.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                close()
                moveTo(17.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.473f, 1.215f)
                lineToRelative(-0.02f, 0.14f)
                lineTo(16.0f, 16.5f)
                verticalLineToRelative(1.62f)
                lineToRelative(-1.444f, 0.406f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.08f, 1.466f)
                lineToRelative(0.109f, 0.008f)
                horizontalLineToRelative(5.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.19f, -1.474f)
                lineToRelative(-1.013f, -0.283f)
                lineTo(19.0f, 18.12f)
                lineTo(19.0f, 16.5f)
                lineToRelative(-0.007f, -0.144f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 15.0f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _printerCloudLine!!
    }

private var _printerCloudLine: ImageVector? = null
