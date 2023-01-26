package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ImportContacts: ImageVector
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
                verticalLineToRelative(14.65f)
                curveToRelative(0.0f, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f)
                curveToRelative(0.1f, 0.0f, 0.15f, -0.05f, 0.25f, -0.05f)
                curveTo(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f)
                curveToRelative(1.95f, 0.0f, 4.05f, 0.4f, 5.5f, 1.5f)
                curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f)
                curveToRelative(1.65f, 0.0f, 3.35f, 0.3f, 4.75f, 1.05f)
                curveToRelative(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f)
                curveToRelative(0.25f, 0.0f, 0.5f, -0.25f, 0.5f, -0.5f)
                lineTo(23.0f, 6.0f)
                curveToRelative(-0.6f, -0.45f, -1.25f, -0.75f, -2.0f, -1.0f)
                close()
                moveTo(3.0f, 18.5f)
                lineTo(3.0f, 7.0f)
                curveToRelative(1.1f, -0.35f, 2.3f, -0.5f, 3.5f, -0.5f)
                curveToRelative(1.34f, 0.0f, 3.13f, 0.41f, 4.5f, 0.99f)
                verticalLineToRelative(11.5f)
                curveTo(9.63f, 18.41f, 7.84f, 18.0f, 6.5f, 18.0f)
                curveToRelative(-1.2f, 0.0f, -2.4f, 0.15f, -3.5f, 0.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f)
                curveToRelative(-1.34f, 0.0f, -3.13f, 0.41f, -4.5f, 0.99f)
                lineTo(13.0f, 7.49f)
                curveToRelative(1.37f, -0.59f, 3.16f, -0.99f, 4.5f, -0.99f)
                curveToRelative(1.2f, 0.0f, 2.4f, 0.15f, 3.5f, 0.5f)
                verticalLineToRelative(11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 7.49f)
                curveToRelative(-1.37f, -0.58f, -3.16f, -0.99f, -4.5f, -0.99f)
                curveToRelative(-1.2f, 0.0f, -2.4f, 0.15f, -3.5f, 0.5f)
                verticalLineToRelative(11.5f)
                curveToRelative(1.1f, -0.35f, 2.3f, -0.5f, 3.5f, -0.5f)
                curveToRelative(1.34f, 0.0f, 3.13f, 0.41f, 4.5f, 0.99f)
                verticalLineTo(7.49f)
                close()
            }
        }
        .build()
        return _importContacts!!
    }

private var _importContacts: ImageVector? = null
