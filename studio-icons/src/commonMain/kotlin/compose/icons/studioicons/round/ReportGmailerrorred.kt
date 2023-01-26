package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ReportGmailerrorred: ImageVector
    get() {
        if (_reportGmailerrorred != null) {
            return _reportGmailerrorred!!
        }
        _reportGmailerrorred = Builder(name = "ReportGmailerrorred", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 7.98f)
                lineTo(16.03f, 3.3f)
                curveToRelative(-0.19f, -0.19f, -0.45f, -0.3f, -0.71f, -0.3f)
                horizontalLineTo(8.68f)
                curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f)
                lineTo(3.29f, 7.98f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.44f, -0.29f, 0.7f)
                verticalLineToRelative(6.63f)
                curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f)
                lineToRelative(4.68f, 4.68f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.71f, 0.3f)
                horizontalLineToRelative(6.63f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.29f)
                lineToRelative(4.68f, -4.68f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                verticalLineTo(8.68f)
                curveToRelative(0.01f, -0.26f, -0.1f, -0.52f, -0.28f, -0.7f)
                close()
                moveTo(19.0f, 14.9f)
                lineTo(14.9f, 19.0f)
                horizontalLineTo(9.1f)
                lineTo(5.0f, 14.9f)
                verticalLineTo(9.1f)
                lineTo(9.1f, 5.0f)
                horizontalLineToRelative(5.8f)
                lineTo(19.0f, 9.1f)
                verticalLineToRelative(5.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _reportGmailerrorred!!
    }

private var _reportGmailerrorred: ImageVector? = null
