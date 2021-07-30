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

public val OutlineGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                horizontalLineToRelative(-0.43f)
                arcTo(10.16f, 10.16f, 0.0f, false, true, 2.0f, 12.29f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 16.12f, 2.88f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, true, 0.77f, 0.86f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, true, -0.1f, 1.16f)
                lineTo(15.5f, 7.28f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, true, -1.83f, 0.64f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 8.77f, 9.0f)
                arcToRelative(4.41f, 4.41f, 0.0f, false, false, -1.16f, 3.34f)
                arcToRelative(4.36f, 4.36f, 0.0f, false, false, 1.66f, 3.0f)
                arcToRelative(4.52f, 4.52f, 0.0f, false, false, 3.45f, 1.0f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, 2.63f, -1.57f)
                horizontalLineToRelative(-2.9f)
                arcTo(1.45f, 1.45f, 0.0f, false, true, 11.0f, 13.33f)
                verticalLineTo(10.65f)
                arcTo(1.45f, 1.45f, 0.0f, false, true, 12.45f, 9.2f)
                horizontalLineToRelative(8.1f)
                arcTo(1.46f, 1.46f, 0.0f, false, true, 22.0f, 10.64f)
                curveToRelative(0.0f, 0.63f, 0.0f, 1.7f, 0.0f, 1.88f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.24f)
                arcTo(8.12f, 8.12f, 0.0f, false, false, 11.65f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.42f)
                verticalLineTo(11.2f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(1.58f)
                horizontalLineToRelative(5.31f)
                lineToRelative(-0.41f, 1.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 13.0f, 18.33f)
                arcTo(6.58f, 6.58f, 0.0f, false, true, 8.0f, 17.0f)
                arcToRelative(6.33f, 6.33f, 0.0f, false, true, -0.72f, -9.3f)
                arcTo(6.52f, 6.52f, 0.0f, false, true, 14.0f, 5.91f)
                lineToRelative(0.77f, -1.43f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
