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

public val OutlineGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(21.0f, 4.0f)
                arcToRelative(1.31f, 1.31f, 0.0f, false, false, -0.06f, -0.27f)
                lineToRelative(0.0f, -0.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.2f, -0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, -0.19f)
                lineToRelative(-0.09f, 0.0f)
                arcTo(0.86f, 0.86f, 0.0f, false, false, 20.05f, 3.0f)
                horizontalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.3f, 0.0f)
                lineToRelative(-18.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.9f)
                lineToRelative(8.53f, 2.84f)
                lineToRelative(2.84f, 8.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.9f, 0.0f)
                lineToRelative(6.0f, -18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 4.0f)
                close()
                moveTo(16.3f, 6.29f)
                lineToRelative(-5.57f, 5.57f)
                lineTo(5.16f, 10.0f)
                close()
                moveTo(14.0f, 18.84f)
                lineToRelative(-1.86f, -5.57f)
                lineTo(17.71f, 7.7f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
