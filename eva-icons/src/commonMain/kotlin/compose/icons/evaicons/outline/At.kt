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

public val OutlineGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -5.0f, 19.1f)
                arcTo(10.15f, 10.15f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 6.08f, -2.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.19f, -1.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, -0.19f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 12.77f, 4.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 20.0f, 12.22f)
                verticalLineToRelative(0.68f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, true, -1.78f, 1.7f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -1.62f, -1.88f)
                verticalLineTo(8.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.87f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.44f, -1.36f)
                arcTo(5.09f, 5.09f, 0.0f, true, false, 15.31f, 15.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 5.55f, 0.61f)
                arcTo(3.67f, 3.67f, 0.0f, false, false, 22.0f, 12.9f)
                verticalLineToRelative(-0.68f)
                arcTo(10.2f, 10.2f, 0.0f, false, false, 13.0f, 2.0f)
                close()
                moveTo(11.18f, 15.09f)
                arcTo(3.09f, 3.09f, 0.0f, true, true, 14.27f, 12.0f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 11.18f, 15.09f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
