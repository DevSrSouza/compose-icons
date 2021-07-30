package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4f, 22.0f)
                arcTo(15.42f, 15.42f, 0.0f, false, true, 2.0f, 6.6f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 6.6f, 2.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 0.77f, 0.07f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, true, 0.72f, 0.18f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.74f, 3.0f)
                lineToRelative(1.37f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.26f, 0.92f)
                curveToRelative(-0.13f, 0.14f, -0.14f, 0.15f, -1.37f, 0.79f)
                arcToRelative(9.91f, 9.91f, 0.0f, false, false, 4.87f, 4.89f)
                curveToRelative(0.65f, -1.24f, 0.66f, -1.25f, 0.8f, -1.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.92f, -0.26f)
                lineToRelative(6.0f, 1.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.72f, 0.65f)
                arcToRelative(4.34f, 4.34f, 0.0f, false, true, 0.19f, 0.73f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, true, 0.06f, 0.76f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 17.4f, 22.0f)
                close()
                moveTo(6.6f, 4.0f)
                arcTo(2.61f, 2.61f, 0.0f, false, false, 4.0f, 6.6f)
                arcTo(13.41f, 13.41f, 0.0f, false, false, 17.4f, 20.0f)
                arcTo(2.61f, 2.61f, 0.0f, false, false, 20.0f, 17.4f)
                curveToRelative(0.0f, -0.11f, 0.0f, -0.22f, 0.0f, -0.33f)
                lineTo(15.36f, 16.0f)
                lineToRelative(-0.29f, 0.55f)
                curveToRelative(-0.45f, 0.87f, -0.78f, 1.5f, -1.62f, 1.16f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, true, -7.18f, -7.21f)
                curveToRelative(-0.36f, -0.78f, 0.32f, -1.14f, 1.18f, -1.59f)
                lineTo(8.0f, 8.64f)
                lineTo(6.93f, 4.0f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
