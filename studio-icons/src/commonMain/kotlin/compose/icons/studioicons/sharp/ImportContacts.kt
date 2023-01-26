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

public val SharpGroup.ImportContacts: ImageVector
    get() {
        if (_importContacts != null) {
            return _importContacts!!
        }
        _importContacts = Builder(name = "ImportContacts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                curveToRelative(-1.11f, -0.35f, -2.33f, -0.5f, -3.5f, -0.5f)
                curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f)
                curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f)
                reflectiveCurveTo(2.45f, 4.9f, 1.0f, 6.0f)
                verticalLineToRelative(15.5f)
                curveTo(2.45f, 20.4f, 4.55f, 20.0f, 6.5f, 20.0f)
                reflectiveCurveToRelative(4.05f, 0.4f, 5.5f, 1.5f)
                curveToRelative(1.45f, -1.1f, 3.55f, -1.5f, 5.5f, -1.5f)
                curveToRelative(1.17f, 0.0f, 2.39f, 0.15f, 3.5f, 0.5f)
                curveToRelative(0.75f, 0.25f, 1.4f, 0.55f, 2.0f, 1.0f)
                lineTo(23.0f, 6.0f)
                curveToRelative(-0.6f, -0.45f, -1.25f, -0.75f, -2.0f, -1.0f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f)
                curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f)
                lineTo(12.0f, 8.0f)
                curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f)
                curveToRelative(1.2f, 0.0f, 2.4f, 0.15f, 3.5f, 0.5f)
                verticalLineToRelative(11.5f)
                close()
            }
        }
        .build()
        return _importContacts!!
    }

private var _importContacts: ImageVector? = null
