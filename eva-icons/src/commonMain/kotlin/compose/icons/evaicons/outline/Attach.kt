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

public val OutlineGroup.Attach: ImageVector
    get() {
        if (_attach != null) {
            return _attach!!
        }
        _attach = Builder(name = "Attach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.29f, 21.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.23f, 6.23f, 0.0f, false, true, -4.43f, -1.88f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.22f, -8.49f)
                lineTo(12.0f, 3.2f)
                arcTo(4.11f, 4.11f, 0.0f, false, true, 15.0f, 2.0f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, 3.19f, 1.35f)
                arcToRelative(4.36f, 4.36f, 0.0f, false, true, 0.15f, 6.13f)
                lineToRelative(-7.4f, 7.43f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, true, -1.81f, 0.75f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.72f, 2.72f, 0.0f, false, true, -1.95f, -0.82f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, true, -0.08f, -3.77f)
                lineToRelative(6.83f, -6.86f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.3f, 7.62f)
                lineTo(8.47f, 14.48f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.08f, 0.95f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, false, 0.53f, 0.23f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.4f, -0.16f)
                lineToRelative(7.39f, -7.43f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, -0.15f, -3.31f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, false, -3.27f, -0.15f)
                lineTo(6.06f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.22f, 5.67f)
                arcToRelative(4.22f, 4.22f, 0.0f, false, false, 3.0f, 1.29f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, 2.61f, -1.06f)
                lineToRelative(7.39f, -7.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.42f, 1.41f)
                lineToRelative(-7.39f, 7.43f)
                arcTo(5.65f, 5.65f, 0.0f, false, true, 9.29f, 21.0f)
                close()
            }
        }
        .build()
        return _attach!!
    }

private var _attach: ImageVector? = null
