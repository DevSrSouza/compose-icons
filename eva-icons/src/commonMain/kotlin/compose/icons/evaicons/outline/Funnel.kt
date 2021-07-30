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

public val OutlineGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.9f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.6f, -0.2f)
                lineToRelative(-4.0f, -3.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.39f, -0.8f)
                lineTo(8.91f, 14.68f)
                lineTo(4.11f, 5.46f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 4.0f)
                lineTo(19.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.86f, 0.49f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.0f)
                lineToRelative(-5.0f, 9.21f)
                lineTo(14.86f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.55f, 0.9f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.9f, 22.0f)
                close()
                moveTo(10.9f, 17.46f)
                lineTo(12.9f, 18.99f)
                lineTo(12.9f, 14.44f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 14.0f)
                lineToRelative(4.3f, -8.0f)
                lineTo(6.64f, 6.0f)
                lineToRelative(4.13f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.11f, 0.46f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
