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

public val OutlineGroup.Sync: ImageVector
    get() {
        if (_sync != null) {
            return _sync!!
        }
        _sync = Builder(name = "Sync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(21.66f, 10.37f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, 0.07f, -0.19f)
                lineToRelative(0.75f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, -0.36f)
                lineToRelative(-0.37f, 2.0f)
                arcToRelative(9.22f, 9.22f, 0.0f, false, false, -16.58f, 0.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.55f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.31f, -0.55f)
                arcTo(7.08f, 7.08f, 0.0f, false, true, 12.07f, 5.0f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, true, 6.24f, 3.58f)
                lineToRelative(-1.65f, -0.27f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.32f, 2.0f)
                lineToRelative(4.25f, 0.71f)
                horizontalLineToRelative(0.16f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, 0.34f, -0.06f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, 0.1f, -0.06f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, false, 0.2f, -0.11f)
                lineToRelative(0.08f, -0.1f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, 0.14f, -0.16f)
                arcTo(0.58f, 0.58f, 0.0f, false, false, 21.66f, 10.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.88f, 14.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.31f, 0.56f)
                arcTo(7.08f, 7.08f, 0.0f, false, true, 11.93f, 19.0f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, true, -6.24f, -3.58f)
                lineToRelative(1.65f, 0.27f)
                lineToRelative(0.16f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.16f, -2.0f)
                lineTo(3.41f, 13.0f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, -0.33f, 0.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.15f, 1.15f, 0.0f, false, false, -0.32f, 0.14f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.18f, 0.18f)
                lineToRelative(-0.09f, 0.1f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.07f, 0.19f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, -0.07f, 0.17f)
                lineToRelative(-0.75f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.32f, 19.0f)
                lineToRelative(0.18f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.82f)
                lineToRelative(0.37f, -2.0f)
                arcToRelative(9.22f, 9.22f, 0.0f, false, false, 16.58f, -0.83f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.88f, 14.07f)
                close()
            }
        }
        .build()
        return _sync!!
    }

private var _sync: ImageVector? = null
