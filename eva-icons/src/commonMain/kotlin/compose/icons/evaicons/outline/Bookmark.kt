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

public val OutlineGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(6.09f, 21.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.94f, 5.4f)
                arcTo(2.26f, 2.26f, 0.0f, false, true, 7.12f, 3.05f)
                lineTo(16.71f, 3.0f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, true, 2.23f, 2.31f)
                lineToRelative(0.14f, 14.66f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.49f, 0.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 0.0f)
                lineToRelative(-5.7f, -3.16f)
                lineTo(6.6f, 20.91f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 6.09f, 21.06f)
                close()
                moveTo(11.85f, 15.51f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, true, 0.5f, 0.12f)
                lineToRelative(4.71f, 2.61f)
                lineTo(16.94f, 5.29f)
                curveToRelative(0.0f, -0.2f, -0.13f, -0.34f, -0.21f, -0.33f)
                lineToRelative(-9.6f, 0.09f)
                curveToRelative(-0.08f, 0.0f, -0.19f, 0.13f, -0.19f, 0.33f)
                lineToRelative(0.12f, 12.9f)
                lineToRelative(4.28f, -2.63f)
                arcTo(1.06f, 1.06f, 0.0f, false, true, 11.85f, 15.51f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
