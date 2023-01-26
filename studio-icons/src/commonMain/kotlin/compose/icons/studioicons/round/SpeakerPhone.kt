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

public val RoundGroup.SpeakerPhone: ImageVector
    get() {
        if (_speakerPhone != null) {
            return _speakerPhone!!
        }
        _speakerPhone = Builder(name = "SpeakerPhone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.76f, 7.83f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(0.35f, 0.35f, 0.89f, 0.38f, 1.3f, 0.09f)
                curveTo(9.91f, 7.37f, 10.92f, 7.02f, 12.0f, 7.02f)
                reflectiveCurveToRelative(2.09f, 0.35f, 2.92f, 0.93f)
                curveToRelative(0.4f, 0.29f, 0.95f, 0.26f, 1.3f, -0.09f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(0.42f, -0.42f, 0.39f, -1.14f, -0.09f, -1.49f)
                curveTo(14.98f, 5.5f, 13.55f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(9.02f, 5.5f, 7.86f, 6.34f)
                curveTo(7.37f, 6.69f, 7.34f, 7.41f, 7.76f, 7.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(9.38f, 1.0f, 6.97f, 1.93f, 5.08f, 3.47f)
                curveTo(4.62f, 3.84f, 4.57f, 4.53f, 5.0f, 4.96f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.36f, 0.36f, 0.93f, 0.39f, 1.32f, 0.07f)
                curveTo(7.86f, 3.76f, 9.85f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(4.14f, 0.76f, 5.69f, 2.03f)
                curveToRelative(0.39f, 0.32f, 0.96f, 0.29f, 1.32f, -0.07f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.42f, -0.42f, 0.38f, -1.11f, -0.08f, -1.49f)
                curveTo(17.03f, 1.93f, 14.62f, 1.0f, 12.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                lineToRelative(-6.0f, 0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.99f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(16.0f, 11.0f)
                curveTo(16.0f, 10.45f, 15.55f, 10.0f, 15.0f, 10.0f)
                close()
                moveTo(15.0f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _speakerPhone!!
    }

private var _speakerPhone: ImageVector? = null
