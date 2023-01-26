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

public val RoundGroup.HdrOff: ImageVector
    get() {
        if (_hdrOff != null) {
            return _hdrOff!!
        }
        _hdrOff = Builder(name = "HdrOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 14.25f)
                lineTo(17.5f, 13.0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.72f, 1.59f)
                curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f)
                curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.96f)
                lineToRelative(-0.49f, -1.14f)
                curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(17.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.9f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.27f, -0.11f, 0.46f, -0.38f, 0.46f, -0.69f)
                close()
                moveTo(17.5f, 10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 10.5f)
                verticalLineToRelative(0.4f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0.0f, -0.82f, -0.68f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.9f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(0.4f)
                close()
                moveTo(21.03f, 21.03f)
                lineToRelative(-18.0f, -18.0f)
                curveToRelative(-0.29f, -0.29f, -0.76f, -0.29f, -1.05f, 0.0f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.76f, 0.0f, 1.05f)
                lineToRelative(4.98f, 4.98f)
                curveToRelative(-0.27f, 0.11f, -0.46f, 0.38f, -0.46f, 0.69f)
                lineTo(6.5f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.5f, 9.75f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(4.5f, 12.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(8.0f, 10.1f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(2.9f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.12f, 0.0f, 0.24f, -0.01f, 0.36f, -0.04f)
                lineToRelative(7.11f, 7.11f)
                curveToRelative(0.29f, 0.29f, 0.76f, 0.29f, 1.05f, 0.0f)
                curveToRelative(0.29f, -0.28f, 0.29f, -0.75f, 0.01f, -1.04f)
                close()
            }
        }
        .build()
        return _hdrOff!!
    }

private var _hdrOff: ImageVector? = null
