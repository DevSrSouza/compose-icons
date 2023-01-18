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

public val RemixIcons.PrinterCloudFill: ImageVector
    get() {
        if (_printerCloudFill != null) {
            return _printerCloudFill!!
        }
        _printerCloudFill = Builder(name = "PrinterCloudFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.566f, 17.0f)
                arcTo(4.737f, 4.737f, 0.0f, false, false, 10.0f, 19.25f)
                curveToRelative(0.0f, 1.023f, 0.324f, 1.973f, 0.877f, 2.75f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.566f)
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
                moveTo(21.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineToRelative(0.001f, 4.346f)
                arcTo(5.482f, 5.482f, 0.0f, false, false, 17.5f, 11.0f)
                lineToRelative(-0.221f, 0.004f)
                arcTo(5.503f, 5.503f, 0.0f, false, false, 12.207f, 15.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 6.0f)
                lineTo(6.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _printerCloudFill!!
    }

private var _printerCloudFill: ImageVector? = null
