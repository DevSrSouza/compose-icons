package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Hubspot: ImageVector
    get() {
        if (_hubspot != null) {
            return _hubspot!!
        }
        _hubspot = Builder(name = "Hubspot", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.832f, 8.6113f)
                lineTo(16.3184f, 14.252f)
                curveTo(15.4948f, 15.2792f, 15.0f, 16.5808f, 15.0f, 18.0f)
                curveTo(15.0f, 19.5517f, 15.5941f, 20.9603f, 16.5605f, 22.0254f)
                lineTo(13.5156f, 25.0703f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 25.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 29.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.9297f, 26.4844f)
                lineTo(18.1387f, 23.2754f)
                curveTo(18.1392f, 23.2757f, 18.1401f, 23.2751f, 18.1406f, 23.2754f)
                curveTo(18.9908f, 23.7372f, 19.9644f, 24.0f, 21.0f, 24.0f)
                curveTo(24.314f, 24.0f, 27.0f, 21.314f, 27.0f, 18.0f)
                curveTo(27.0f, 15.0276f, 24.8367f, 12.5669f, 22.0f, 12.0898f)
                lineTo(22.0f, 8.7305f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 8.7305f)
                lineTo(20.0f, 12.0898f)
                curveTo(19.2215f, 12.2208f, 18.4956f, 12.5023f, 17.8496f, 12.9023f)
                lineTo(9.957f, 6.9551f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.5f, 4.0f)
                close()
                moveTo(21.0f, 15.0f)
                curveTo(22.654f, 15.0f, 24.0f, 16.346f, 24.0f, 18.0f)
                curveTo(24.0f, 19.654f, 22.654f, 21.0f, 21.0f, 21.0f)
                curveTo(19.346f, 21.0f, 18.0f, 19.654f, 18.0f, 18.0f)
                curveTo(18.0f, 16.346f, 19.346f, 15.0f, 21.0f, 15.0f)
                close()
            }
        }
        .build()
        return _hubspot!!
    }

private var _hubspot: ImageVector? = null
