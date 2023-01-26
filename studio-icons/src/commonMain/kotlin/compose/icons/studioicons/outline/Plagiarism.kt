package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Plagiarism: ImageVector
    get() {
        if (_plagiarism != null) {
            return _plagiarism!!
        }
        _plagiarism = Builder(name = "Plagiarism", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f)
                horizontalLineTo(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                close()
                moveTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.03f, 11.03f)
                curveToRelative(-1.37f, 1.37f, -1.37f, 3.58f, 0.0f, 4.95f)
                curveToRelative(1.12f, 1.12f, 2.8f, 1.31f, 4.13f, 0.59f)
                lineToRelative(1.88f, 1.88f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.88f, -1.88f)
                curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f)
                curveTo(12.61f, 9.66f, 10.39f, 9.66f, 9.03f, 11.03f)
                close()
                moveTo(12.56f, 14.56f)
                curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0.0f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f)
                curveTo(13.15f, 13.03f, 13.15f, 13.97f, 12.56f, 14.56f)
                close()
            }
        }
        .build()
        return _plagiarism!!
    }

private var _plagiarism: ImageVector? = null
