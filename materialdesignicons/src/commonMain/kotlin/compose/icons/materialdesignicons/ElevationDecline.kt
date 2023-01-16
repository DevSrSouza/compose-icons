package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.ElevationDecline: ImageVector
    get() {
        if (_elevationDecline != null) {
            return _elevationDecline!!
        }
        _elevationDecline = Builder(name = "ElevationDecline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.25f)
                lineTo(9.45f, 15.0f)
                lineTo(13.22f, 12.8f)
                lineTo(21.0f, 17.29f)
                verticalLineTo(21.0f)
                moveTo(3.0f, 8.94f)
                verticalLineTo(6.75f)
                lineTo(9.45f, 10.5f)
                lineTo(13.22f, 8.3f)
                lineTo(21.0f, 12.79f)
                verticalLineTo(15.0f)
                lineTo(13.22f, 10.5f)
                lineTo(9.45f, 12.67f)
                lineTo(3.0f, 8.94f)
                close()
            }
        }
        .build()
        return _elevationDecline!!
    }

private var _elevationDecline: ImageVector? = null
