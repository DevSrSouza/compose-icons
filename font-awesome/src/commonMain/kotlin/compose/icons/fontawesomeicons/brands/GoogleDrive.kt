package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.GoogleDrive: ImageVector
    get() {
        if (_googleDrive != null) {
            return _googleDrive!!
        }
        _googleDrive = Builder(name = "GoogleDrive", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(339.0f, 314.9f)
                lineTo(175.4f, 32.0f)
                horizontalLineToRelative(161.2f)
                lineToRelative(163.6f, 282.9f)
                lineTo(339.0f, 314.9f)
                close()
                moveTo(201.5f, 338.5f)
                lineTo(120.9f, 480.0f)
                horizontalLineToRelative(310.5f)
                lineTo(512.0f, 338.5f)
                lineTo(201.5f, 338.5f)
                close()
                moveTo(154.1f, 67.4f)
                lineTo(0.0f, 338.5f)
                lineTo(80.6f, 480.0f)
                lineTo(237.0f, 208.8f)
                lineTo(154.1f, 67.4f)
                close()
            }
        }
        .build()
        return _googleDrive!!
    }

private var _googleDrive: ImageVector? = null
