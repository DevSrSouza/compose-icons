package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ReportOff: ImageVector
    get() {
        if (_reportOff != null) {
            return _reportOff!!
        }
        _reportOff = Builder(name = "ReportOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.33f)
                lineToRelative(7.2f, 7.2f)
                lineToRelative(0.51f, -0.51f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                verticalLineTo(8.68f)
                curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-4.68f, -4.68f)
                curveToRelative(-0.19f, -0.18f, -0.45f, -0.29f, -0.71f, -0.29f)
                horizontalLineTo(8.68f)
                curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f)
                lineToRelative(-0.51f, 0.51f)
                lineToRelative(3.69f, 3.69f)
                curveToRelative(0.17f, -0.29f, 0.48f, -0.49f, 0.84f, -0.49f)
                close()
                moveTo(2.41f, 1.58f)
                lineTo(1.0f, 2.99f)
                lineToRelative(3.64f, 3.64f)
                lineToRelative(-1.35f, 1.35f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.44f, -0.29f, 0.7f)
                verticalLineToRelative(6.63f)
                curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f)
                lineToRelative(4.68f, 4.68f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.71f, 0.3f)
                horizontalLineToRelative(6.63f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.29f)
                lineToRelative(1.35f, -1.35f)
                lineTo(21.01f, 23.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.41f, 1.58f)
                close()
                moveTo(12.0f, 17.3f)
                curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f)
                curveToRelative(0.0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f)
                reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f)
                curveToRelative(0.0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f)
                close()
            }
        }
        .build()
        return _reportOff!!
    }

private var _reportOff: ImageVector? = null
