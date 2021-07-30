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

public val SimpleIcons.Airtable: ImageVector
    get() {
        if (_airtable != null) {
            return _airtable!!
        }
        _airtable = Builder(name = "Airtable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.992f, 1.966f)
                curveToRelative(-0.434f, 0.0f, -0.87f, 0.086f, -1.28f, 0.257f)
                lineTo(1.779f, 5.917f)
                curveToRelative(-0.503f, 0.208f, -0.49f, 0.908f, 0.012f, 1.116f)
                lineToRelative(8.982f, 3.558f)
                arcToRelative(3.266f, 3.266f, 0.0f, false, false, 2.454f, 0.0f)
                lineToRelative(8.982f, -3.558f)
                curveToRelative(0.503f, -0.196f, 0.503f, -0.908f, 0.012f, -1.116f)
                lineToRelative(-8.957f, -3.694f)
                arcToRelative(3.255f, 3.255f, 0.0f, false, false, -1.272f, -0.257f)
                close()
                moveTo(23.4f, 8.056f)
                arcToRelative(0.589f, 0.589f, 0.0f, false, false, -0.222f, 0.045f)
                lineToRelative(-10.012f, 3.877f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, -0.38f, 0.564f)
                verticalLineToRelative(8.896f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.821f, 0.552f)
                lineTo(23.62f, 18.1f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, false, 0.38f, -0.551f)
                verticalLineTo(8.653f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.6f, -0.596f)
                close()
                moveTo(0.676f, 8.095f)
                arcToRelative(0.644f, 0.644f, 0.0f, false, false, -0.48f, 0.19f)
                curveTo(0.086f, 8.396f, 0.0f, 8.53f, 0.0f, 8.69f)
                verticalLineToRelative(8.355f)
                curveToRelative(0.0f, 0.442f, 0.515f, 0.737f, 0.908f, 0.54f)
                lineToRelative(6.27f, -3.006f)
                lineToRelative(0.307f, -0.147f)
                lineToRelative(2.969f, -1.436f)
                curveToRelative(0.466f, -0.22f, 0.43f, -0.908f, -0.061f, -1.092f)
                lineTo(0.883f, 8.138f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.207f, -0.044f)
                close()
            }
        }
        .build()
        return _airtable!!
    }

private var _airtable: ImageVector? = null
