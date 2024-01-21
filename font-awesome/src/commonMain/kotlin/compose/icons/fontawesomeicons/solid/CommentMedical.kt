package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CommentMedical: ImageVector
    get() {
        if (_commentMedical != null) {
            return _commentMedical!!
        }
        _commentMedical = Builder(name = "CommentMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 448.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -93.1f, 256.0f, -208.0f)
                reflectiveCurveTo(397.4f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveTo(0.0f, 125.1f, 0.0f, 240.0f)
                curveToRelative(0.0f, 45.1f, 17.7f, 86.8f, 47.7f, 120.9f)
                curveToRelative(-1.9f, 24.5f, -11.4f, 46.3f, -21.4f, 62.9f)
                curveToRelative(-5.5f, 9.2f, -11.1f, 16.6f, -15.2f, 21.6f)
                curveToRelative(-2.1f, 2.5f, -3.7f, 4.4f, -4.9f, 5.7f)
                curveToRelative(-0.6f, 0.6f, -1.0f, 1.1f, -1.3f, 1.4f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-4.6f, 4.6f, -5.9f, 11.4f, -3.4f, 17.4f)
                curveToRelative(2.5f, 6.0f, 8.3f, 9.9f, 14.8f, 9.9f)
                curveToRelative(28.7f, 0.0f, 57.6f, -8.9f, 81.6f, -19.3f)
                curveToRelative(22.9f, -10.0f, 42.4f, -21.9f, 54.3f, -30.6f)
                curveToRelative(31.8f, 11.5f, 67.0f, 17.9f, 104.1f, 17.9f)
                close()
                moveTo(224.0f, 160.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(288.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(240.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(272.0f)
                horizontalLineTo(176.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(160.0f)
                close()
            }
        }
        .build()
        return _commentMedical!!
    }

private var _commentMedical: ImageVector? = null
