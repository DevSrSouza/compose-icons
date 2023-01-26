package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Voicemail: ImageVector
    get() {
        if (_voicemail != null) {
            return _voicemail!!
        }
        _voicemail = Builder(name = "Voicemail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 6.0f)
                curveTo(15.46f, 6.0f, 13.0f, 8.46f, 13.0f, 11.5f)
                curveToRelative(0.0f, 1.33f, 0.47f, 2.55f, 1.26f, 3.5f)
                lineTo(9.74f, 15.0f)
                curveToRelative(0.79f, -0.95f, 1.26f, -2.17f, 1.26f, -3.5f)
                curveTo(11.0f, 8.46f, 8.54f, 6.0f, 5.5f, 6.0f)
                reflectiveCurveTo(0.0f, 8.46f, 0.0f, 11.5f)
                reflectiveCurveTo(2.46f, 17.0f, 5.5f, 17.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.04f, 0.0f, 5.5f, -2.46f, 5.5f, -5.5f)
                reflectiveCurveTo(21.54f, 6.0f, 18.5f, 6.0f)
                close()
                moveTo(5.5f, 15.0f)
                curveTo(3.57f, 15.0f, 2.0f, 13.43f, 2.0f, 11.5f)
                reflectiveCurveTo(3.57f, 8.0f, 5.5f, 8.0f)
                reflectiveCurveTo(9.0f, 9.57f, 9.0f, 11.5f)
                reflectiveCurveTo(7.43f, 15.0f, 5.5f, 15.0f)
                close()
                moveTo(18.5f, 15.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveTo(16.57f, 8.0f, 18.5f, 8.0f)
                reflectiveCurveTo(22.0f, 9.57f, 22.0f, 11.5f)
                reflectiveCurveTo(20.43f, 15.0f, 18.5f, 15.0f)
                close()
            }
        }
        .build()
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
